using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
 
namespace NodoSimpleC
{
    class NodoSimpleC
    {
        class Nodo {
            public int info;
            public Nodo sig;
        }
    
        private Nodo raiz;
    
        public NodoSimpleC () 
        {
            raiz=null;
        }
      
        void Insertar (int x) {
 
                Nodo nuevo = new Nodo ();
                nuevo.info = x;
 
                    if (raiz == null){
                        nuevo.sig = null;
                        raiz = nuevo;
                    }else{
                        nuevo.sig = raiz;
                        raiz = nuevo;
                    }
                } 
 
        public int Extraer (int x)
        {
                  if (raiz!=null)
            {
                int informacion = raiz.info;
                raiz = raiz.sig;
                return informacion;
            }
            else
            {
                return int.MaxValue;
            }
        }
 
            
    
        public bool Vacia ()
        {
            if (raiz == null)
                return true;
            else
                return false;
        }
    
        public void Imprimir ()
        {
            Nodo reco = raiz;
            while (reco != null) 
            {
                Console.Write (reco.info + "-");
                reco = reco.sig;
            }
            Console.WriteLine();
        }
        
 
        static void Main(string[] args)
        {
            NodoSimpleC lg=new NodoSimpleC();
            lg.Insertar (10);
            lg.Insertar (20);
            lg.Insertar (30);
            lg.Insertar (15);
            lg.Insertar (115);
            lg.Imprimir ();
            Console.WriteLine("Luego de Extraer el segundo");
            lg.Extraer (2);
            lg.Imprimir ();
        }
    }
}