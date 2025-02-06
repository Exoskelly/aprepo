import random
import unittest
from prog985u import Quicksort
from time import perf_counter as current_time
    
def generate_large_list():
    return [random.randint(0, 10000000) for i in range(1000000)]
       
class TestQuicksort(unittest.TestCase):
     def setUp(self):
        self.startTime = current_time()
               
    def tearDown(self):
        t = current_time() - self.startTime
        print(f"{self.id()}: {t:6g}")
               
    def test_normal_case(self):
        input_arr = [4, 2, 5, 1, 3]
        expected_output = [1, 2, 3, 4, 5]
        self.assertEqual(Quicksort.sort(input_arr), expected_output)
                    
    def test_empty_list():
        input_arr = []
        expected_output = []
        assert Quicksort.sort(input) == expected_output
                         
    def test_single_element():
        input_arr = [1]    
        expected_output = [1]
        assert Quicksort.sort(input) == expected_output

    def test_single_element():
        input_arr = [1]
        expected_output = [1]
        assert Quicksort.sort(input) == expected_output

    def test_identical_elements():
        input_arr = [5, 5, 5, 5]
        expected_output = [5, 5, 5, 5]
        assert Quicksort.sort(input) == expected_output

    def test_negative_numbers():
        input_arr = [-3, -1, -4, -2]
        expected_output = [-4, -3, -2, -1]
        assert Quicksort.sort(input) == expected_output

    def test_mixed_types():
        input_arr = [3.2, 1.5, 4.8, 2.1]
        expected_output = [1.5, 2.1, 3.2, 4.8]
        assert Quicksort.sort(input) == expected_output

    def test_performance_large_dataset(self):
        input_arr = generate_large_list()
        start_time = current_time()
        Quicksort.sort(input_arr)
        end_time = current_time()
        self.assertLess(end_time-start_time, 10)

if __name__ == '__main__':
    suite = unittest.TestLoader().loadTestsFromTestCase(TestQuicksort)
    unittest.TextTestRunner(verbosity = 0).run(suite)