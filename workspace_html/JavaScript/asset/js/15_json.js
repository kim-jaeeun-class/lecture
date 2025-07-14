// 배열 : 값을 순서로 관리
const array = [];

// json : 값을 key로 관리
// json 선언
let json = {};

json = {
	"key" : "value",
	"num" : 123,
	// js 한정 ""를 쓰지 않거나 ''로 써도 ok
	'key1' : 'v1',
	// key2 : k3,
	key4 : array,
	key5 : function(){console.log('key5 실행')},
	key6: {
		c1: 'c_v1',
		c2: 'c_v2'
    }
};

console.log(json);


// 값 접근
// 방법 1 : 배열처럼 접근
json['key'];
console.log(json['key']);
// 방법 2 : 프로퍼티처럼 접근
json.key;
console.log(json.key);

console.log(json.key6.c1);
console.log(json['key6']['c1']);

json.key4.push(1);
json.key4.push(2);
json.key4.push(3);
console.log(json.key4);

json.key5();

json.key = 'value2';
console.log(json.key);

json.key2 = 'key2 추가'
console.log(json.key2);
console.log(json.key3);

// 네트워크는 모든 것을 문자로 전송해야 함
// json을 문자열로 만들어줌
// 단, 값이 함수인 것은 제외
console.log('stringify and parse')
const str = JSON.stringify(json);
console.log(str);

const json2 = JSON.parse(str);


const arrJson = [{
    empno: '7788',
    ename: 'Scott'
    },
    {
        empno: '1234',
        ename: 'Allen'
    }
];
const emp = JSON.stringify(arrJson);
console.log(emp);

console.log(JSON.parse(emp));

// 모든 key 출력
// json에서 index는 key
// json[k]로 값까지 가져오기 가능
for(let k in json) {
    console.log(k, json[k]);
}
// json의 모든 key를 가져옴
// 위와의 차이점 : 배열로 뽑아줌
const keys = Object.keys(json);
console.log(keys);

delete json.key4;
delete json["key4"];