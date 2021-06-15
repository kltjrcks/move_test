# -*- coding : utf-8 -*-
#문자열 내 p와 y의 개수
def solution(s):
    pCount = 0
    yCount = 0

    for i in range(len(s)):
        tmp = s[i].upper()
        if tmp == 'P':
            pCount += 1
        elif tmp == 'Y':
            yCount +=1

    if yCount == pCount:
        return True
    else:
        return False


print(solution('pPY'))