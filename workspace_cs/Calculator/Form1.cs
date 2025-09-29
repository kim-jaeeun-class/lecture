namespace Calculator
{
    public partial class Form1 : Form
    {
        int firstNum = 0;
        string op = "";
        bool isNext = false;

        public Form1()
        {
            InitializeComponent();
        }
        // 사칙 연산 여러 개 두고 싶으면 배열 등 사용해서 해보기

        private void btn_plus_Click(object sender, EventArgs e)
        {
            this.firstNum = Int32.Parse(display.Text);
            op = "+";
            isNext = true;
        }
        private void btn_min_Click(object sender, EventArgs e)
        {
            this.firstNum = Int32.Parse(display.Text);
            op = "-";
            isNext = true;
        }
        private void btn_mul_Click(object sender, EventArgs e)
        {
            this.firstNum = Int32.Parse(display.Text);
            op = "*";
            isNext = true;
        }
        private void btn_div_Click(object sender, EventArgs e)
        {
            this.firstNum = Int32.Parse(display.Text);
            op = "/";
            isNext = true;
        }
        private void btn_c_Click(object sender, EventArgs e)
        {
            // c : 리셋 버튼
            display.Text = "0";
            op = "";
            isNext = false;
        }
        private void btn_eq_Click(object sender, EventArgs e)
        {
            // eq : 결과 버튼
            // 여기에서 해야 할 일
            // 1. 결과값들이 입력되어 있었다면 그에 맞는 결과가 나오도록
            int result = 0;
            isNext = true;

            if (op == "+")
            {
                result = firstNum + Int32.Parse(display.Text);
            }
            else if (op == "-")
            {
                result = firstNum - Int32.Parse(display.Text);
            }
            else if (op == "*") 
            {
                result = firstNum * Int32.Parse(display.Text);
            }
            else if (op == "/")
            {
                // 3. 나누기 버튼 입력 후 0을 누른 경우 그 결괏값이 처리되도록
                if (Int32.Parse(display.Text) == 0)
                {
                    display.Text = "error!";
                    return;
                }
                else
                {
                    result = firstNum / Int32.Parse(display.Text);
                }
            }

            display.Text = "" + result;
            // 2. 이후 다른 숫자가 입력되면 리셋되도록
            
        }


        private void button1_Click(object sender, EventArgs e)
        {
            if (isNext)
            {
                display.Text = "";
                isNext = false;
            }
            string str = display.Text += "7";
            int i = Int32.Parse(str);
            display.Text = "" + i;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            if (isNext)
            {
                display.Text = "";
                isNext = false;
            }
            string str = display.Text += "9";
            int i = Int32.Parse(str);
            display.Text = "" + i;
        }

        private void button6_Click(object sender, EventArgs e)
        {
            if (isNext)
            {
                display.Text = "";
                isNext = false;
            }
            string str = display.Text += "5";
            int i = Int32.Parse(str);
            display.Text = "" + i;
        }

        private void btn8_Click(object sender, EventArgs e)
        {
            if (isNext)
            {
                display.Text = "";
                isNext = false;
            }
            string str = display.Text += "8";
            int i = Int32.Parse(str);
            display.Text = "" + i;
        }

        private void btn4_Click(object sender, EventArgs e)
        {
            if (isNext)
            {
                display.Text = "";
                isNext = false;
            }
            string str = display.Text += "4";
            int i = Int32.Parse(str);
            display.Text = "" + i;
        }

        private void btn6_Click(object sender, EventArgs e)
        {
            if (isNext)
            {
                display.Text = "";
                isNext = false;
            }
            string str = display.Text += "6";
            int i = Int32.Parse(str);
            display.Text = "" + i;
        }

        private void btn1_Click(object sender, EventArgs e)
        {
            if (isNext)
            {
                display.Text = "";
                isNext = false;
            }
            string str = display.Text += "1";
            int i = Int32.Parse(str);
            display.Text = "" + i;
        }

        private void btn2_Click(object sender, EventArgs e)
        {
            if (isNext)
            {
                display.Text = "";
                isNext = false;
            }
            string str = display.Text += "2";
            int i = Int32.Parse(str);
            display.Text = "" + i;
        }

        private void btn3_Click(object sender, EventArgs e)
        {
            if (isNext)
            {
                display.Text = "";
                isNext = false;
            }
            string str = display.Text += "3";
            int i = Int32.Parse(str);
            display.Text = "" + i;
        }
        private void btn0_Click(object sender, EventArgs e)
        {
            if (isNext)
            {
                display.Text = "";
                isNext = false;
            }
            string str = display.Text += "0";
            int i = Int32.Parse(str);
            display.Text = "" + i;
        }
        private void label1_Click(object sender, EventArgs e)
        {

        }
    }
}
