const {chromium} = require('playwright');

test();

async function test() {
    const browser = await chromium.launch({
        headless: false    // false면 브라우저 실행이고 true면 백?
    })
    const ctx = await browser.newContext()
    const page = await ctx.newPage()
    await page.goto("https://naver.com")

    await page.waitForSelector('#query')
    await page.fill('#query', '천안 맛집')
    await page.click('#search-btn')
    await page.waitForSelector('#place-app-root')
    await page.screenshot({
        path: 'a.png',
        full_page: true
    })
}

