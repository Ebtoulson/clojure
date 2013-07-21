; By listing the first six prime numbers: 
; 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

; What is the 10 001st prime number?

; copy paste from problem 3
(defn factors [number]
  (filter #(zero? (rem number %))
    ;excluding 1 and the number itself so I can do an empty test later
    (range 2 number)))

(defn primes [position]
  (nth (filter #(empty? (factors %)) (iterate inc 1)) position))

; (primes 10001) => 104743