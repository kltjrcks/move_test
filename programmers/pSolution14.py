# -*- coding : utf-8 -*-
# 이상한 문자 만들기
def solution(s):
    answer = ''
    s_list = s.split(' ')
    for i in s_list:
        index = 0
        for i2 in i:
            if index % 2 == 0:
                answer += i2.upper()
            else:
                answer += i2.lower()

            index += 1
        answer += ' '
    #
    answer = answer[:-1]
    return answer


print(solution("try  hello world manderd "))