/*
Name : silvericarus
College : None
Year/Branch : None
Email Id : albin2@yahoo.com
*/

function switch_base(char){
	switch(char){
		case 'I':return 1;
		case 'V':return 5;
		case 'X':return 10;
		case 'L':return 50;
		case 'C':return 100;
    	case 'D':return 500;
		case 'M':return 1000;
		default : return -1;
	}
}

function translate_romans_decimal(roman) {
	var finalNum = switch_base(roman.charAt(0));
	var pre_num,current;

	for (var i = 1; i < roman.length; i++) {
		current = switch_base(roman.charAt(i));
		pre_num = switch_base(roman.charAt(i-1));
		if(current <= pre_num){
			finalNum += current;
		}else{
			finalNum = finalNum - pre_num*2 + current;
		}
	}
	return finalNum;
}

console.log("XXXXXXIX",translate_romans_decimal("XXXXXXIX"),"CDXX",translate_romans_decimal("CDXX"));