(ns banco.imposto.logic)

(defn- esta-na-faixa-de-isencao? [value]
  (< value 1000))

(defn imposto-retido-fonte [value]
  (if (esta-na-faixa-de-isencao? value)
    0
    (* value 0.1M)))

