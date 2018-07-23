<?php

namespace CalculatorBundle\Entity;

use Doctrine\ORM\Query\Expr\Math;

class Calculator
{
    /**
     * @var float
     */
    private $leftOperand;
    /**
     * @var float
     */
    private $rightOperand;

    /**
     * @var string
     */
    private $operator;

    /**
     * @return float
     */
    public function getLeftOperand(): ?float
    {
        return $this->leftOperand;
    }

    /**
     * @param float $leftOperand
     */
    public function setLeftOperand(float $leftOperand)
    {
        $this->leftOperand = $leftOperand;
    }

    /**
     * @return float
     */
    public function getRightOperand(): ?float
    {
        return $this->rightOperand;
    }

    /**
     * @param float $rightOperand
     */
    public function setRightOperand(float $rightOperand)
    {
        $this->rightOperand = $rightOperand;
    }

    /**
     * @return string
     */
    public function getOperator(): ?string
    {
        return $this->operator;
    }

    /**
     * @param string $operator
     */
    public function setOperator(string $operator)
    {
        $this->operator = $operator;
    }

    /**
     * @return float
     */
    public function calculateResult(): ?float
    {
        $result = 0;

        switch ($this->getOperator()) {

            case "+":
                $result = $this->getLeftOperand() + $this->getRightOperand();
                break;
            case "-":
                $result = $this->getLeftOperand() - $this->getRightOperand();
                break;
            case "*":
                $result = $this->getLeftOperand() * $this->getRightOperand();
                break;
            case "/":
                $result = $this->getLeftOperand() / $this->getRightOperand();
                break;
            case "^":
                $result = pow($this->getLeftOperand(), $this->getRightOperand());
                break;
            case "√":
                $result = sqrt($this->getLeftOperand());
                break;
            case "mod":
                $result = $this->getLeftOperand() % $this->getRightOperand();
                break;
            case "sin":
                $result = number_format(sin($this->getLeftOperand() / (180 / pi())), 6, '.', '');
                break;
            case "cos":
                $result = number_format(cos($this->getLeftOperand() / (180 / pi())), 6, '.', '');
                break;
            case "tan":
                $result = number_format(tan($this->getLeftOperand() / (180 / pi())), 6, '.', '');
                break;
            case "!":
                function factorial($num)
                {
                    if ($num < 0) {
                        return NAN;
                    } else if ($num == 0) {
                        return '1';
                    } else {
                        return ($num * factorial($num - 1));
                    }
                }

                $result = factorial($this->getLeftOperand());
                break;
            case "ln":
                $result = number_format(log($this->getLeftOperand()), 6, '.', '');
                break;
        }

        return $result;
    }
}