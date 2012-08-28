; What is the first term in the Fibonacci sequence to contain 1000 digits?

(defn fib [a b]
  (lazy-cat [a] (fib b (+ a b))))

(count (take-while #(> 1000 (count (str %))) (fib 0 1)))

; => 4782