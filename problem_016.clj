; 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

; What is the sum of the digits of the number 2^1000?

(defn sum_digits [base exp]
  (reduce + (map #(Integer. (str %))
    (str (.pow (bigint base) exp)))))

; (sum_digits 2 1000) => 1366