# -*- coding : utf-8 -*-
# 예산
def solution(d, budget):
    sol(0, d, budget)

def sol(n, d, budget):
    for i in range(n, len(d)):
        print(i)
        sol(n+1, d, budget)


print(solution([1,3,2,5,4],9))
#print(solution([2,2,3,3],10))