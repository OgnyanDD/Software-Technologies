using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace CalculatorApp.Models
{
    public class Calculator
    {
        public Calculator()
        {
            this.Result = 0;
        }

        public double LeftOperand { get; set; }

        public double RightOperand { get; set; }

        public string Operator { get; set; }

        public double Result { get; set; }


        public void CalculateResult()
        {
            switch (this.Operator)
            {
                case "+":
                    {
                        this.Result = this.LeftOperand + this.RightOperand;
                    }
                    break;

                case "-":
                    {
                        this.Result = this.LeftOperand - this.RightOperand;
                    }
                    break;

                case "*":
                    {
                        this.Result = this.LeftOperand * this.RightOperand;
                    }
                    break;

                case "/":
                    {
                        this.Result = this.LeftOperand / this.RightOperand;
                    }
                    break;

                case "^":
                    {
                        this.Result = Math.Pow(this.LeftOperand, this.RightOperand);
                    }
                    break;

                case "mod":
                    {
                        this.Result = this.LeftOperand % this.RightOperand;
                    }
                    break;

                case "√":
                    {
                        this.Result = Math.Sqrt(this.LeftOperand);
                    }
                    break;

                case "sin":
                    {
                        this.Result = Math.Sin(this.LeftOperand / (180 / Math.PI));
                    }
                    break;

                case "cos":
                    {
                        this.Result = Math.Cos(this.LeftOperand / (180 / Math.PI));
                    }
                    break;

                case "tan":
                    {
                        this.Result = Math.Tan(this.LeftOperand / (180 / Math.PI));
                    }
                    break;

                case "!":
                    {
                        this.Result = Factorial(this.LeftOperand);
                    }
                    break;

                case "ln":
                    {
                        this.Result = Math.Log(this.LeftOperand);
                    }
                    break;

                default:
                {
                    this.Result = 0;
                }
                    break;
            }
        }

        private static double Factorial(double leftOperand)
        {
            if (leftOperand < 0)
            {
                return Double.NaN;
            }
            else if (leftOperand == 0)
            {
                return 1;
            }
            else
            {
                return (leftOperand * Factorial(leftOperand - 1));
            }
        }
    }
}