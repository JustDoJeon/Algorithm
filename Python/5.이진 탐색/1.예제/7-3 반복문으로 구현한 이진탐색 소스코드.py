def binaray_search(array,target,start,end):
    while start<=end:
        mid = (start+end) // 2
        if array[mid] == target:
            return mid
        elif target > array[mid]:
            start = mid + 1
        else:
            end = mid-1
    return None


n,target = list(map(int, input().split()))
#전체 원소 입력받기
array = list(map(int, input().split()))

#이진 탐색 수행 결과 출력
result = binaray_search(array, target, 0, n-1)
if result == None:
    print('원소가 존재하지 않아')
else:
    print(result+1)



'''
추가 내용
트리자료구조
노드와 노드의 연결로 표현하며 여기서 노드는 정보의 단위로서 어떠한 정보를 가지고있는 개체로 이해할 수 있다.
특징
1.트리는 부모 노드와 자식 노드의 관계로 표현한다.
2.트리의 최상단 노드는 루트 노드라고한다.
3.트리의 최하단 노드를 단말 노드라고한다
4.트리에서 일부를 떼어내도 트리 구조이며 이를 서브 트리라한다.
5.트리는 파일 시스템과 같이 계층적이고 정렬된 데이터를 다루기에 적합하다.

이진 탐색 트리
1) 부모노드보다 왼쪽 자식 노드가 작다.
2) 부모노드보다 오른쪽 자식 노드가 크다.

'''

'''
sys 라이브러리를 사용할 때는 한 줄 입력받고 나서 rstrip() 함수를 꼭 호출해야한다. 
-> 소스코드에 readline()으로 입력하면 입력 후 엔터가 줄 바꿈 기호로 입력되는데 이 공백 문자를 제거하려면 rstrip()함수를 사용해야한다. 

'''