# -*- coding : utf-8 -*-
#JadenCase 문자열 만들기
def solution(str):
    answer = ''
    splitStr = str.split(' ')
    for s in splitStr:
        for i in range(len(s)):
            if i == 0:
                answer += (s[i].upper())
            else:
                answer +=(s[i].lower())
        answer += ' '

    return answer[:len(answer)-1]


print(solution("3people unFo  llowed me"))