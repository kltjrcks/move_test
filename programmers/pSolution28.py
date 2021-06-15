# -*- coding : utf-8 -*-
# 크레인 인형뽑기 게임
def solution(board, move):
    answer = []
    count = 0
    for i in move:
        i = i - 1
        for dol in board:
            if dol[i] == 0:
                pass
            else:
                answer.append(dol[i])
                dol[i] = 0
                break

        for ans in range(len(answer)):
            if ans != 0:
                if answer[ans] == answer[ans-1]:
                    del answer[ans]
                    del answer[ans-1]
                    count += 2
            else:
                pass
    return count

arr = [[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]]
arr2 = [1,5,3,5,1,2,1,4]
print(solution(arr, arr2))