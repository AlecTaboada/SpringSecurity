CREATE TABLE usuario (
      
       id_usu      INT   NOT NULL,
       nombre      VARCHAR(25) NOT NULL,
       apellido     VARCHAR(50) NOT NULL,
       usuario      VARCHAR(50) NOT NULL,
       contraseña      VARCHAR(20) NOT NULL,
 
    
       CONSTRAINT PKUsuario 
              PRIMARY KEY ( id_usu)
       
           
);
commit;
CREATE SEQUENCE Secuencia_Usuario
INCREMENT BY 1
START WITH 1;
commit;

CREATE OR REPLACE TRIGGER Trigger_Usuario_Id
BEFORE INSERT ON usuario
REFERENCING NEW AS NEW FOR EACH ROW
DECLARE valorSecuencia NUMBER := 0;
BEGIN
SELECT Secuencia_Usuario.NEXTVAL INTO valorSecuencia FROM DUAL;
:NEW.id_usu := valorSecuencia;
END;
commit;

insert into usuario values('','Taboada', 'Alec','Mercy', '1234');
commit;
insert into usuario values('','Ugarte', 'Miguel','MiUg', '12345');
commit;
select * from usuario;

