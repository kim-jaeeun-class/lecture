namespace Calculator
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            display = new Label();
            tableLayoutPanel1 = new TableLayoutPanel();
            btn_div = new Button();
            btn_eq = new Button();
            btn_c = new Button();
            btn0 = new Button();
            btn_mul = new Button();
            btn3 = new Button();
            btn2 = new Button();
            btn1 = new Button();
            btn_min = new Button();
            btn6 = new Button();
            btn5 = new Button();
            btn4 = new Button();
            btn_plus = new Button();
            btn9 = new Button();
            btn8 = new Button();
            btn7 = new Button();
            tableLayoutPanel1.SuspendLayout();
            SuspendLayout();
            // 
            // display
            // 
            display.Font = new Font("Pretendard Variable ExtraBold", 48F, FontStyle.Bold, GraphicsUnit.Point, 0);
            display.Location = new Point(12, 9);
            display.Name = "display";
            display.Size = new Size(257, 83);
            display.TabIndex = 0;
            display.Text = "0";
            display.TextAlign = ContentAlignment.MiddleRight;
            display.Click += label1_Click;
            // 
            // tableLayoutPanel1
            // 
            tableLayoutPanel1.ColumnCount = 4;
            tableLayoutPanel1.ColumnStyles.Add(new ColumnStyle(SizeType.Percent, 25F));
            tableLayoutPanel1.ColumnStyles.Add(new ColumnStyle(SizeType.Percent, 25F));
            tableLayoutPanel1.ColumnStyles.Add(new ColumnStyle(SizeType.Percent, 25F));
            tableLayoutPanel1.ColumnStyles.Add(new ColumnStyle(SizeType.Percent, 25F));
            tableLayoutPanel1.Controls.Add(btn_div, 3, 3);
            tableLayoutPanel1.Controls.Add(btn_eq, 2, 3);
            tableLayoutPanel1.Controls.Add(btn_c, 1, 3);
            tableLayoutPanel1.Controls.Add(btn0, 0, 3);
            tableLayoutPanel1.Controls.Add(btn_mul, 3, 2);
            tableLayoutPanel1.Controls.Add(btn3, 2, 2);
            tableLayoutPanel1.Controls.Add(btn2, 1, 2);
            tableLayoutPanel1.Controls.Add(btn1, 0, 2);
            tableLayoutPanel1.Controls.Add(btn_min, 3, 1);
            tableLayoutPanel1.Controls.Add(btn6, 2, 1);
            tableLayoutPanel1.Controls.Add(btn5, 1, 1);
            tableLayoutPanel1.Controls.Add(btn4, 0, 1);
            tableLayoutPanel1.Controls.Add(btn_plus, 3, 0);
            tableLayoutPanel1.Controls.Add(btn9, 2, 0);
            tableLayoutPanel1.Controls.Add(btn8, 1, 0);
            tableLayoutPanel1.Controls.Add(btn7, 0, 0);
            tableLayoutPanel1.Dock = DockStyle.Bottom;
            tableLayoutPanel1.Location = new Point(0, 95);
            tableLayoutPanel1.Name = "tableLayoutPanel1";
            tableLayoutPanel1.RowCount = 4;
            tableLayoutPanel1.RowStyles.Add(new RowStyle(SizeType.Percent, 25F));
            tableLayoutPanel1.RowStyles.Add(new RowStyle(SizeType.Percent, 25F));
            tableLayoutPanel1.RowStyles.Add(new RowStyle(SizeType.Percent, 25F));
            tableLayoutPanel1.RowStyles.Add(new RowStyle(SizeType.Percent, 25F));
            tableLayoutPanel1.Size = new Size(281, 355);
            tableLayoutPanel1.TabIndex = 1;
            // 
            // btn_div
            // 
            btn_div.Font = new Font("Pretendard Variable", 36F, FontStyle.Bold, GraphicsUnit.Point, 129);
            btn_div.Location = new Point(213, 267);
            btn_div.Name = "btn_div";
            btn_div.Size = new Size(64, 82);
            btn_div.TabIndex = 17;
            btn_div.Text = "/";
            btn_div.UseVisualStyleBackColor = true;
            btn_div.Click += btn_div_Click;
            // 
            // btn_eq
            // 
            btn_eq.Font = new Font("Pretendard Variable", 36F, FontStyle.Bold, GraphicsUnit.Point, 129);
            btn_eq.Location = new Point(143, 267);
            btn_eq.Name = "btn_eq";
            btn_eq.Size = new Size(64, 82);
            btn_eq.TabIndex = 16;
            btn_eq.Text = "=";
            btn_eq.UseVisualStyleBackColor = true;
            btn_eq.Click += btn_eq_Click;
            // 
            // btn_c
            // 
            btn_c.Font = new Font("Pretendard Variable", 36F, FontStyle.Bold, GraphicsUnit.Point, 129);
            btn_c.Location = new Point(73, 267);
            btn_c.Name = "btn_c";
            btn_c.Size = new Size(64, 82);
            btn_c.TabIndex = 15;
            btn_c.Text = "C";
            btn_c.UseVisualStyleBackColor = true;
            btn_c.Click += btn_c_Click;
            // 
            // btn0
            // 
            btn0.Font = new Font("Pretendard Variable SemiBold", 36F, FontStyle.Bold);
            btn0.Location = new Point(3, 267);
            btn0.Name = "btn0";
            btn0.Size = new Size(64, 82);
            btn0.TabIndex = 14;
            btn0.Text = "0";
            btn0.UseVisualStyleBackColor = true;
            btn0.Click += btn0_Click;
            // 
            // btn_mul
            // 
            btn_mul.Font = new Font("Pretendard Variable", 36F, FontStyle.Bold, GraphicsUnit.Point, 129);
            btn_mul.Location = new Point(213, 179);
            btn_mul.Name = "btn_mul";
            btn_mul.Size = new Size(64, 82);
            btn_mul.TabIndex = 13;
            btn_mul.Text = "*";
            btn_mul.UseVisualStyleBackColor = true;
            btn_mul.Click += btn_mul_Click;
            // 
            // btn3
            // 
            btn3.Font = new Font("Pretendard Variable SemiBold", 36F, FontStyle.Bold);
            btn3.Location = new Point(143, 179);
            btn3.Name = "btn3";
            btn3.Size = new Size(64, 82);
            btn3.TabIndex = 12;
            btn3.Text = "3";
            btn3.UseVisualStyleBackColor = true;
            btn3.Click += btn3_Click;
            // 
            // btn2
            // 
            btn2.Font = new Font("Pretendard Variable SemiBold", 36F, FontStyle.Bold);
            btn2.Location = new Point(73, 179);
            btn2.Name = "btn2";
            btn2.Size = new Size(64, 82);
            btn2.TabIndex = 11;
            btn2.Text = "2";
            btn2.UseVisualStyleBackColor = true;
            btn2.Click += btn2_Click;
            // 
            // btn1
            // 
            btn1.Font = new Font("Pretendard Variable SemiBold", 36F, FontStyle.Bold);
            btn1.Location = new Point(3, 179);
            btn1.Name = "btn1";
            btn1.Size = new Size(64, 82);
            btn1.TabIndex = 10;
            btn1.Text = "1";
            btn1.UseVisualStyleBackColor = true;
            btn1.Click += btn1_Click;
            // 
            // btn_min
            // 
            btn_min.Font = new Font("Pretendard Variable", 36F, FontStyle.Bold, GraphicsUnit.Point, 129);
            btn_min.Location = new Point(213, 91);
            btn_min.Name = "btn_min";
            btn_min.Size = new Size(64, 82);
            btn_min.TabIndex = 9;
            btn_min.Text = "-";
            btn_min.UseVisualStyleBackColor = true;
            btn_min.Click += btn_min_Click;
            // 
            // btn6
            // 
            btn6.Font = new Font("Pretendard Variable SemiBold", 36F, FontStyle.Bold);
            btn6.Location = new Point(143, 91);
            btn6.Name = "btn6";
            btn6.Size = new Size(64, 82);
            btn6.TabIndex = 8;
            btn6.Text = "6";
            btn6.UseVisualStyleBackColor = true;
            btn6.Click += btn6_Click;
            // 
            // btn5
            // 
            btn5.Font = new Font("Pretendard Variable SemiBold", 36F, FontStyle.Bold);
            btn5.Location = new Point(73, 91);
            btn5.Name = "btn5";
            btn5.Size = new Size(64, 82);
            btn5.TabIndex = 7;
            btn5.Text = "5";
            btn5.UseVisualStyleBackColor = true;
            btn5.Click += button6_Click;
            // 
            // btn4
            // 
            btn4.Font = new Font("Pretendard Variable SemiBold", 36F, FontStyle.Bold);
            btn4.Location = new Point(3, 91);
            btn4.Name = "btn4";
            btn4.Size = new Size(64, 82);
            btn4.TabIndex = 6;
            btn4.Text = "4";
            btn4.UseVisualStyleBackColor = true;
            btn4.Click += btn4_Click;
            // 
            // btn_plus
            // 
            btn_plus.Font = new Font("Pretendard Variable", 36F, FontStyle.Bold, GraphicsUnit.Point, 129);
            btn_plus.Location = new Point(213, 3);
            btn_plus.Name = "btn_plus";
            btn_plus.Size = new Size(64, 82);
            btn_plus.TabIndex = 5;
            btn_plus.Text = "+";
            btn_plus.UseVisualStyleBackColor = true;
            btn_plus.Click += btn_plus_Click;
            // 
            // btn9
            // 
            btn9.Font = new Font("Pretendard Variable SemiBold", 36F, FontStyle.Bold);
            btn9.Location = new Point(143, 3);
            btn9.Name = "btn9";
            btn9.Size = new Size(64, 82);
            btn9.TabIndex = 4;
            btn9.Text = "9";
            btn9.UseVisualStyleBackColor = true;
            btn9.Click += button3_Click;
            // 
            // btn8
            // 
            btn8.Font = new Font("Pretendard Variable SemiBold", 36F, FontStyle.Bold);
            btn8.Location = new Point(73, 3);
            btn8.Name = "btn8";
            btn8.Size = new Size(64, 82);
            btn8.TabIndex = 3;
            btn8.Text = "8";
            btn8.UseVisualStyleBackColor = true;
            btn8.Click += btn8_Click;
            // 
            // btn7
            // 
            btn7.Font = new Font("Pretendard Variable SemiBold", 36F, FontStyle.Bold);
            btn7.Location = new Point(3, 3);
            btn7.Name = "btn7";
            btn7.Size = new Size(64, 82);
            btn7.TabIndex = 2;
            btn7.Text = "7";
            btn7.UseVisualStyleBackColor = true;
            btn7.Click += button1_Click;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(281, 450);
            Controls.Add(tableLayoutPanel1);
            Controls.Add(display);
            Name = "Form1";
            Text = "Form1";
            tableLayoutPanel1.ResumeLayout(false);
            ResumeLayout(false);
        }

        #endregion

        private Label display;
        private TableLayoutPanel tableLayoutPanel1;
        private Button btn7;
        private Button btn_mul;
        private Button btn3;
        private Button btn2;
        private Button btn1;
        private Button btn_min;
        private Button btn6;
        private Button btn5;
        private Button btn4;
        private Button btn_plus;
        private Button btn9;
        private Button btn8;
        private Button btn_div;
        private Button btn_eq;
        private Button btn_c;
        private Button btn0;
    }
}
