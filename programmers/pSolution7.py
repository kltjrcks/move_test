# -*- coding : utf-8 -*-
#문자열 내림차순으로 배치하기
def solution(s):
    answer = ''
    lowerList = list()
    upperList = list()

    for i in s:
        if i.isupper():
            upperList.append(i)
        else:
            lowerList.append(i)

    lowerList.sort(reverse=True)
    upperList.sort(reverse=True)

    answerList = lowerList + upperList

    for a in answerList:
        answer += a

    return answer

print(solution('Zbcdefg'))