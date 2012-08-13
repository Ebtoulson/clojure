; A Pythagorean triplet is a set of three natural numbers,
; a  b  c, for which,

; a^2 + b^2 = c^2
; For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

; There exists exactly one Pythagorean triplet for
; which a + b + c = 1000. Find the product abc.

(defn pyth [a b]
  (Math/sqrt (+ (* a a) (* b b))))

(defn pyth_triplet [sum]
  (for [
      a (range 1 sum)
      b (range a sum)
      :when (= sum (+ a b (pyth a b)))
    ] [a b (int (pyth a b))]
  ))

(reduce * (first(pyth_triplet 1000)))

;(* 200 375 425) => 31875000