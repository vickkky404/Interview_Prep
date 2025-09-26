# insert element at given position

def insert(arr , x , pos):
    if pos < 0 or pos > len(arr):
        print("Invalid position")
        return arr
    arr.insert(pos , x)
    return arr

def main():
    arr =[10,20,30,40,50]
    print("Before insertion: " , arr)
    arr = insert(arr , 60 , 2)
    print("After insertion: " , arr)

if __name__=="__main__":
    main()