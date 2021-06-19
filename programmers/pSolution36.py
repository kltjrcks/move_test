# -*- coding : utf-8 -*-
# 올바른 괄호
def solution(s):
    answer = 0
    for i in s:
        if answer == -1:
            return False
        else:
            if i == "(":
                answer += 1
            elif i == ")":
                answer -= 1
    if answer != 0:
        return False
    else:
        return True


print(solution("()()"))