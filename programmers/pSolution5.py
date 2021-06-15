# -*- coding : utf-8 -*-
#직사각형 별찍기

a, b = map(int,input().strip().split(' '))
for n in range(b):
    answer = ''
    for m in range(a):
        answer += '*'
    print(answer)

