# -*- coding : utf-8 -*-
# 124나라
def solution(n):
    while True:
        if n <= 3:
            return '124'[n-1]
        else:
            q, remainder = divmod(n-1, 3)

            return solution(q) + '124'[remainder]

print(solution(100))

'''
#solution1... 처음시도 -> 효율성문제로 기각당함
def solution(n):
    answer = ''
    nth = 0
    max_ = 0
    temp = 0
    value = ''
    while True:
        if max_ > n:
            for i1 in range(nth-1, -1, -1):
                if i1 == 0:
                    if (n == 1):
                        value = '1'
                    elif (n == 2):
                        value = '2'
                    elif (n == 3):
                        value = '4'
                    else:
                        print("??1")
                    answer += value
                    break
                else:
                    for t in range(i1-1, -1, -1):
                        temp += pow(3, t)

                for i2 in range(3, 0, -1):
                    tmp = pow(3, i1) * i2 + temp
                    if tmp <= n:
                        n = n - (pow(3, i1) * i2)
                        temp = 0
                        if(i2 == 1):
                            value = '1'
                        elif(i2 == 2):
                            value = '2'
                        elif(i2 == 3):
                            value = '4'
                        else:
                            print("??2")
                        answer += value
                        break

            break
        else:
            max_ += pow(3, nth) * 3
            nth += 1

    return answer
'''

