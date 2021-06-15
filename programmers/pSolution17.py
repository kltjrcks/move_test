# -*- coding : utf-8 -*-
# 시저암호
from string import ascii_uppercase
from string import ascii_lowercase

def findList(alphabetList, s, num):
    tmp = alphabetList.index(s) + num
    if tmp > 25:
        tmp = tmp - 26

    return alphabetList[tmp]


def solution(s, n):
    answer = ''
    alpha_upper_list = list(ascii_uppercase)
    alpha_lower_list = list(ascii_lowercase)

    for i in s:
        if i == ' ':
            tmp = i
        elif i.isupper():
            tmp = findList(alpha_upper_list, i, n)

        elif i.islower():
            tmp = findList(alpha_lower_list, i, n)

        answer += tmp
    return answer


print(solution("a B z", 4))