package entidades;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class Imagen {
    private String denominacion;

    public Imagen(String denominacion) {
        this.denominacion = denominacion;
    }


}
