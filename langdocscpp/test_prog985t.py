import unittest
import time
from prog985t import MergeSort

class TestMergeSort(unittest.TestCase):
    def test_normal_case(self):
        input_data = [4, 2, 5, 1, 3]
        expected_output = [1, 2, 3, 4, 5]
        self.assertEqual(MergeSort.sort(input_data), expected_output)

    def test_empty_list(self):
        input_data = []
        expected_output = []
        self.assertEqual(MergeSort.sort(input_data), expected_output)

    def test_single_element(self):
        input_data = [1]
        expected_output = [1]
        self.assertEqual(MergeSort.sort(input_data), expected_output)

    def test_identical_elements(self):
        input_data = [5, 5, 5, 5]
        expected_output = [5, 5, 5, 5]
        self.assertEqual(MergeSort.sort(input_data), expected_output)

    def test_negative_numbers(self):
        input_data = [-3, -1, -4, -2]
        expected_output = [-4, -3, -2, -1]
        self.assertEqual(MergeSort.sort(input_data), expected_output)

    def test_mixed_types(self):
        input_data = [3.2, 1.5, 4.8, 2.1]
        expected_output = [1.5, 2.1, 3.2, 4.8]
        self.assertEqual(MergeSort.sort(input_data), expected_output)

    def test_performance_large_dataset(self):
        input_data = list(range(1000000, 0, -1)) 
        start_time = time.time()
        MergeSort.sort(input_data)
        end_time = time.time()
        time_taken = end_time - start_time
        print(f"Time taken for sorting large dataset: {time_taken}")
        self.assertTrue(time_taken < 5) 

if __name__ == '__main__':
    unittest.main()