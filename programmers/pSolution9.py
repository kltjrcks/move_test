# -*- coding : utf-8 -*-
#가운데 글자 가져오기
def solution(s):
    answer = ''
    if len(s) % 2 == 1:
        a = (len(s) - 1) // 2
        return s[a]
    else:
        a = len(s) // 2
        return s[a-1:a+1]

print(solution('1234'))