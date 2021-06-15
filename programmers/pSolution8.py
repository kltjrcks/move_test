# -*- coding : utf-8 -*-
#문자열 다루기 기본
def solution(s):
    if len(s) == (4 or 6):
        if s.isnumeric():
            return True
        else:
            return False
    else:
        return False

print(solution('1234'))