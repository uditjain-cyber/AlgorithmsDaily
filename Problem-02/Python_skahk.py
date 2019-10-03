# Name : Saksham Sharma
# College Name : Amrita School of Engineering
# Year/Department : IV/CSE
# E-Mail Id : saksham6620@gmail.com

def check(exp):
    li=list()
    for i in exp:
        if i in ['[','(','{']:
            li.append(i)
        else:
            if i==']':
                if li[-1]=='[':
                    li.pop()
                else:
                    return False
            elif i==')':
                if li[-1]=='(':
                    li.pop()
                else:
                    return False
            else:
                if li[-1]=='{':
                    li.pop()
                else:
                    return False
    return True

print('Enter expression: ',end=' ')
exp = input()
if check(exp):
    print('Balanced')
else:
    print('Not Balanced')