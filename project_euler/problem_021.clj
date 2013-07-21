; Let d(n) be defined as the sum of proper divisors
; of n (numbers less than n which divide evenly into n).
; If d(a) = b and d(b) = a, where a  b, then a and b
; are an amicable pair and each of a and b are called amicable numbers.

; For example, the proper divisors of 220 are 
; 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. 
; The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

; Evaluate the sum of all the amicable numbers under 10000.

(defn factors [n]
  (let [x   (into (sorted-set)
    (mapcat (fn [x] [x (/ n x)])
      (filter #(zero? (rem n %)) (range 1 (inc (Math/sqrt n)))) ))]
    (if (= (count x) 1)
      (into () x)
      (drop-last x))))

(defn amicable? [n]
  (let [f (reduce + (factors n))]
    (if (and (= n (reduce + (factors f))) (not= n f))
      n 0)))

(defn amicable_sum [n]
  (reduce + (map #(amicable? %) (range 1 (inc n)))))

; (amicable_sum 9999) => 31626