# -*- coding : utf-8 -*-
# 하샤드 수
def solution(n):
    harshad = 0
    for i in str(n):
        harshad += int(i)

    if n % harshad == 0:
        return True
    else:
        return False


print(solution(13))