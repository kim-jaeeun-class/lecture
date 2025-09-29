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
        // ��Ģ ���� ���� �� �ΰ� ������ �迭 �� ����ؼ� �غ���

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
            // c : ���� ��ư
            display.Text = "0";
            op = "";
            isNext = false;
        }
        private void btn_eq_Click(object sender, EventArgs e)
        {
            // eq : ��� ��ư
            // ���⿡�� �ؾ� �� ��
            // 1. ��������� �ԷµǾ� �־��ٸ� �׿� �´� ����� ��������
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
                // 3. ������ ��ư �Է� �� 0�� ���� ��� �� �ᱣ���� ó���ǵ���
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
            // 2. ���� �ٸ� ���ڰ� �ԷµǸ� ���µǵ���
            
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
