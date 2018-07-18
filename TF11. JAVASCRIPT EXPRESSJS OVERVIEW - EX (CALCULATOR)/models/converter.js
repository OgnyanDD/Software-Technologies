function Converter(input, unit) {
    this.input = input;
    this.unit = unit;

    this.converterResult = function () {
        let result = 0;

        switch (this.unit) {
            case 'HEX':

            function decimalToHexString(number) {
                if (number < 0) {
                    number = 0xFFFFFFFF + number + 1;
                }
                return number.toString(16).toUpperCase();
            }

                result = decimalToHexString(this.input);
                break;
            case 'BIN':

            function decimalToBinString(number) {
                let num = number;

                if (num != Math.floor(num)) {
                    return NaN;
                } else if (num < 0) {
                    return NaN
                } else {
                    let binary = parseInt(num, 10);
                    return binary.toString(2);
                }
            }

                result = decimalToBinString(this.input);
                break;
            case'inch':
                result = this.input * 0.393700787;
                break;
            case'mile':
                result = this.input * 0.621371192;
                break;
            case'yard':
                result = this.input * 1093.6133;
                break;
            case'bar':
                result = this.input * 0.0001;
                break;
            case'pascal':
                result = this.input * 9.80665;
                break;
            case'kelvin':
                result = this.input * 274.15;
                break;
            case'fahrenheit':
                result = this.input * 33.8;
                break;
            case'rad':
                result = this.input * 0.01745;
                break;
            case'gra':
                result = this.input * 1.11111;
                break;
            case'bit':
                result = this.input * 8000000;
                break;
        }
        return result;
    }
}

module.exports = Converter;