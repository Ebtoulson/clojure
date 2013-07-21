; 2520 is the smallest number that can be divided by
; each of the numbers from 1 to 10 without any remainder.

; What is the smallest positive number that is evenly
; divisible by all of the numbers from 1 to 20?

(defn divisible? [n]
  (every? #(zero? (rem n %)) '(7 9 11 13 16 17 19 20)))

(first (filter #(divisible? %) (iterate inc 2520)))

; 232792560 
; definitely need to redo this one, brute force takes like 30 secs