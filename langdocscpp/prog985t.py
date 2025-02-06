class MergeSort:
    @staticmethod
    def sort(arr):
        if len(arr) <= 1:
            return arr
        mid = len(arr) // 2
        left = MergeSort.sort(arr[:mid])
        right = MergeSort.sort(arr[mid:])
        return MergeSort.merge(left, right)

    @staticmethod
    def merge(left, right):
        sorted_list = []
        while left and right:
            if left[0] < right[0]:
                sorted_list.append(left.pop(0))
            else:
                sorted_list.append(right.pop(0))
        sorted_list.extend(left)
        sorted_list.extend(right)
        return sorted_list