; The prime factors of 13195 are 5, 7, 13 and 29.
; What is the largest prime factor of the number 600851475143 ?

(defn factors [number]
	(filter #(zero? (rem number %))
		;excluding 1 and the number itself so I can do an empty test later
		(range 2 number)))

(defn primes [number]
	(take-while #(empty? (factors %)) (factors number)))

(defn largest-prime [number]
	(last (primes number)))

;6857 dat complexity 0_o