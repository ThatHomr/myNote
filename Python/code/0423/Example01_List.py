
# Example01-List.py

# 상위 30% 내의 점수들을 출력하는 프로그램을 작성.
print('-'*50)

scores = [91, 53, 87, 48, 90, 78, 56, 78, 61, 81, 50, 90, 100, 90, 67, 98]
scores_copy = scores.copy()
percentage = 45
top_percent = percentage / 100 

# 상위 30% 이내에 포함되는 점수의 개수
scores_count = int(len(scores_copy) * top_percent) # 정수부분만 있으면 되기 때문에 정수형으로 변환

print(f'상위 {percentage}%의 점수({scores_count}개) 구하기')

print('-'*50)

# 기존의 점수들을 출력
print(f'scores = {scores_copy}')

# 정렬된 점수들을 출력
# scores.sort() # 오름차순
# print(f'scores = {scores}')
# top_scores = scores[ : -scores_count-1 : -1]
# print(f'top_scores = {top_scores}')

scores_copy.sort(reverse=True) # 내림차순
print(f'scores = {scores_copy}')
top_scores = scores_copy[ : scores_count] # 0 <= i < scores_count
print(f'top_scores = {top_scores}')

print('-'*50)
print(f'{scores} 중에서 상위 {percentage}% 점수 = {top_scores}')
print('-'*50)