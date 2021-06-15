# -*- coding : utf-8 -*-
#콜라츠 추측
def solution(n):
    count = 0
    while True:
        if n == 1:
            return count
        elif count > 500:
            return -1

        if n % 2 == 0:
            n = n // 2
        else:
            n = (n * 3) + 1

        count += 1

print(solution(6))