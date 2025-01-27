import unittest
from prog985a import Calc 
from time import perf_counter as current_time

class TestCalc(unittest.TestCase):
    def setUp(self):
        self.startTime = current_time()
    
    def tearDown(self):
        t = current_time() - self.startTime
        print(f"{self.id()}: {t:6g}")
    
    def test_add_normal_case(self):
        self.assertEqual(Calc.add(1, 2), 3)
    
    def test_add_edge_case(self):
        self.assertEqual(Calc.add(0, 0), 0)
        
    def test_add_error_case(self):
        self.assertEqual(Calc.add(1, -1), 0)
    
    def test_div_normal_case(self):
        self.assertEqual(Calc.div(1, 2), .5)
    
    def test_add_edge_case(self):
        with self.assertRaises(ZeroDivisionError):
            Calc.div(0, 0)
        
    def test_add_error_case(self):
        self.assertEqual(Calc.div(1, -1), -1)
    
if __name__ == '__main__':
    suite.unittest.TestLoader().loadTestsFromTestCase(TestCalc)
    unittest.TextTestRunner(verbosity=0),run(suite)