# Name : Saksham Sharma
# College Name : Amrita School of Engineering
# Year/Department : IV/CSE
# E-Mail Id : saksham6620@gmail.com

def checkPrime(num):
    for i in range(2,int((num**0.5) + 1)):
        if num%i==0:
            return False
    return True

print('Enter n: ',end=' ')
n=int(input())
for i in range(2,n+1):
    if checkPrime(i):
        print(i,end=' ')
print()