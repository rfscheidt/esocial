//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2018.08.06 �s 01:46:16 PM GMT-03:00 
//


package br.gov.ce.seplag.esocial.mensageiro.schemas.retornoenvio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="retornoEnvioLoteEventos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/retornoEnvio/v1_1_0}TIdeEmpregador" minOccurs="0"/>
 *                   &lt;element name="ideTransmissor" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/retornoEnvio/v1_1_0}TIdeTransmissor" minOccurs="0"/>
 *                   &lt;element name="status" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/retornoEnvio/v1_1_0}TStatus"/>
 *                   &lt;element name="dadosRecepcaoLote" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/retornoEnvio/v1_1_0}TDadosRecepcao" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "retornoEnvioLoteEventos"
})
@XmlRootElement(name = "eSocial")
public class RetornoEnvio {

    @XmlElement(required = true)
    protected RetornoEnvio.RetornoEnvioLoteEventos retornoEnvioLoteEventos;

    /**
     * Obt�m o valor da propriedade retornoEnvioLoteEventos.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.RetornoEnvioLoteEventos }
     *     
     */
    public RetornoEnvio.RetornoEnvioLoteEventos getRetornoEnvioLoteEventos() {
        return retornoEnvioLoteEventos;
    }

    /**
     * Define o valor da propriedade retornoEnvioLoteEventos.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.RetornoEnvioLoteEventos }
     *     
     */
    public void setRetornoEnvioLoteEventos(RetornoEnvio.RetornoEnvioLoteEventos value) {
        this.retornoEnvioLoteEventos = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/retornoEnvio/v1_1_0}TIdeEmpregador" minOccurs="0"/>
     *         &lt;element name="ideTransmissor" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/retornoEnvio/v1_1_0}TIdeTransmissor" minOccurs="0"/>
     *         &lt;element name="status" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/retornoEnvio/v1_1_0}TStatus"/>
     *         &lt;element name="dadosRecepcaoLote" type="{http://www.esocial.gov.br/schema/lote/eventos/envio/retornoEnvio/v1_1_0}TDadosRecepcao" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ideEmpregador",
        "ideTransmissor",
        "status",
        "dadosRecepcaoLote"
    })
    public static class RetornoEnvioLoteEventos {

        protected TIdeEmpregador ideEmpregador;
        protected TIdeTransmissor ideTransmissor;
        @XmlElement(required = true)
        protected TStatus status;
        protected TDadosRecepcao dadosRecepcaoLote;

        /**
         * Obt�m o valor da propriedade ideEmpregador.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEmpregador }
         *     
         */
        public TIdeEmpregador getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Define o valor da propriedade ideEmpregador.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEmpregador }
         *     
         */
        public void setIdeEmpregador(TIdeEmpregador value) {
            this.ideEmpregador = value;
        }

        /**
         * Obt�m o valor da propriedade ideTransmissor.
         * 
         * @return
         *     possible object is
         *     {@link TIdeTransmissor }
         *     
         */
        public TIdeTransmissor getIdeTransmissor() {
            return ideTransmissor;
        }

        /**
         * Define o valor da propriedade ideTransmissor.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeTransmissor }
         *     
         */
        public void setIdeTransmissor(TIdeTransmissor value) {
            this.ideTransmissor = value;
        }

        /**
         * Obt�m o valor da propriedade status.
         * 
         * @return
         *     possible object is
         *     {@link TStatus }
         *     
         */
        public TStatus getStatus() {
            return status;
        }

        /**
         * Define o valor da propriedade status.
         * 
         * @param value
         *     allowed object is
         *     {@link TStatus }
         *     
         */
        public void setStatus(TStatus value) {
            this.status = value;
        }

        /**
         * Obt�m o valor da propriedade dadosRecepcaoLote.
         * 
         * @return
         *     possible object is
         *     {@link TDadosRecepcao }
         *     
         */
        public TDadosRecepcao getDadosRecepcaoLote() {
            return dadosRecepcaoLote;
        }

        /**
         * Define o valor da propriedade dadosRecepcaoLote.
         * 
         * @param value
         *     allowed object is
         *     {@link TDadosRecepcao }
         *     
         */
        public void setDadosRecepcaoLote(TDadosRecepcao value) {
            this.dadosRecepcaoLote = value;
        }

    }

}
