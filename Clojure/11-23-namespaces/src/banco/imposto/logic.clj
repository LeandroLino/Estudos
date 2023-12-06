(ns banco.imposto.logic)

(defn imposto-retido-fonte [value]
  (if (< value 1000)
    0
    (* value 0.1M)))
