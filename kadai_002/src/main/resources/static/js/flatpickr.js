let maxDate = new Date();
 maxDate = maxDate.setMonth(maxDate.getMonth() + 3);
 
 flatpickr('#fromReservationDate', {
   mode: "single",
   locale: 'ja',
   minDate: 'today',
   maxDate: maxDate
 });