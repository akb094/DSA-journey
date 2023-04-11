def spiral_pattern(matrix, m, n):
    ans = []
    top = 0
    left = 0
    right = n-1
    bottom = m-1
    direction = 0
    while(left<=right and top <= bottom):
        if(direction == 0):
            for col in range(left, right+1):
                ans.append(matrix[top][col])
            top += 1
        elif(direction == 1):
            for row in range(top, bottom+1):
                ans.append(matrix[row][right])
            right -= 1
        elif(direction == 2):
            for col in reversed(range(left, right+1)):
                ans.append(matrix[bottom][col])
            bottom -= 1
        elif(direction == 3):
            for row in reversed(range(top, bottom+1)):
                ans.append(matrix[row][left])
            left += 1
        direction = (direction+1)%4
    return ans

R = int(input("rows:"))
C = int(input("columns:"))
  

matrix = []
print("Enter elements:\n")
  
for i in range(R):         
    a =[]
    for j in range(C):      
         a.append(int(input()))
    matrix.append(a)
  
answer = spiral_pattern(matrix, R, C)
print(answer)
