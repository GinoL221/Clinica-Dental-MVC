const path = require('path');

const dentistEdit = (req, res) => {
  try {
    const dentistId = req.params.id;
    
    res.render("dentists/dentistEdit", {
      title: "Editar Dentista | Dental Clinic",
      dentistId: dentistId,
    });
  } catch (error) {
    console.error('Error al mostrar formulario de editar dentista:', error);
    res.status(500).render('404NotFound', {
      title: 'Error del servidor',
      message: 'Error interno del servidor'
    });
  }
};

module.exports = dentistEdit;
