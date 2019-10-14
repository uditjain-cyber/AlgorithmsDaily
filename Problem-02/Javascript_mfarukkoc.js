/*
Author : Mehmet Faruk Koc
College : Istanbul Kultur University
Year/Department : 3/CSE
E-Mail Id : mfarukkoc@gmail.com
*/

const CheckParanthesis = (string) => {
  let stack = []
  let paranthesis = {
    '{': '}',
    '[': ']',
    '(' : ')'
  }
  
  for(let i = 0 ; i < string.length ; i++) {
    if (string[i] === '(' || string[i] === '{' || string[i] === '[' ) {
          stack.push(string[i]);
        }
        //  If that character is a closing brace, pop from the stack, which will also reduce the length of the stack each time a closing bracket is encountered.
    else {
          let last = stack.pop();
            //If the popped element from the stack, which is the last opening brace doesn’t match the corresponding closing brace in the map, then return false
          if (string[i] !== paranthesis[last]) { 
            return false;
            }
        }
  }
  return stack.length === 0;
}

examplestr = prompt()

if(CheckParanthesis(examplestr))
  alert("Balanced");
else
  alert("Not balanced");
