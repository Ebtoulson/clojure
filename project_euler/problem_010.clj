; The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

; Find the sum of all the primes below two million.

(defn sum_primes [number]
  (apply + (filter #(.isProbablePrime (bigint %) 10)
    (range 1 number))))

; (sum_primes 2000000) => 142913828922