;Tipos em clojure

(type 10)
;java.lang.Long

(type 10.0)
;java.lang.Double

(type (/ 10 3))
;java.lang.Ratio

(type (* 3 (/ 10 3)))
;java.lang.BigInt

(type 10N)
;java.lang.BigInt

(type 10M)
;java.lang.BigDeciaml

(type "---")
;java.lang.String

(type nil)
;nil

(type [nil])
;clojure.lang.PersistentVector

(type println)
;clojure.core$println