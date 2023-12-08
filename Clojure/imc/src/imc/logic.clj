(ns imc.logic)

(defn- valor-imc [peso altura]
  (/ peso (* altura altura)))

(defn indicador-imc [peso altura]
  (let [calculo-imc (valor-imc peso altura)]
    (if (< calculo-imc 18.5)
      :peso-baixo
      (if (< calculo-imc 24.9)
        :peso-ideal
        :peso-acima))))
  