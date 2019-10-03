'''
Author : Utkarsh Gupta
College : Birla Institute of Technology, Mesra
Year/Department : III/IT
E-Mail Id : utkryuk@gmail.com
'''

def reverseString(inputString):
    inputWords = inputString.split()
    inputWords = inputWords[::-1]
    for index in range(len(inputWords)):
        print(inputWords[index], end=' ')

inputString = str(input())
reverseString(inputString)
