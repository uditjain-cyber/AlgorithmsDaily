# Name : Saksham Sharma
# College Name : Amrita School of Engineering
# Year/Department : IV/CSE
# E-Mail Id : saksham6620@gmail.com

print('Enter the list(space seperated): ',end=' ')
li=list(map(int,input().split()))
print('Enter n: ',end=' ')
n=int(input())
if n==0 or n>len(li):
    print('Error')
else:
    print(li[-n])