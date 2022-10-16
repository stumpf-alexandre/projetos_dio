// ============================================
// As of Chart.js v2.5.0
// http://www.chartjs.org/docs
// ============================================

var chart    = document.getElementById('chart').getContext('2d'),
    gradient = chart.createLinearGradient(0, 0, 0, 450);
    gradientd = chart.createLinearGradient(0, 0, 0, 450);

gradient.addColorStop(0, 'rgba(242, 87,116, 0.5)');
gradient.addColorStop(0.5, 'rgba(242, 87,116, 0.25)');
gradient.addColorStop(1, 'rgba(242, 87,116, 0)');
gradientd.addColorStop(0, 'rgba(242, 202, 80, 0.5)');
gradientd.addColorStop(0.5, 'rgba(242, 202, 80, 0.25)');
gradientd.addColorStop(1, 'rgba(242, 202, 80, 0)');

var data  = {
    labels: [ 'Janvier', 'Février', 'Mars', 'Avril', 'Mai', 'Juin', 'Juillet', 'Août', 'Septembre', 'Octobre', 'Novembre', 'Décembre' ],
    datasets: [{
			label: 'CA',
			backgroundColor: gradient,
			pointBackgroundColor: '#F25774',
			borderWidth: 1,
			borderColor: '#F25774',
			data: [3616.49, 2853.34, 2554.41, 1510.16, 2024.81, 1706.82, 2057.85, 0, 0, 0, 0, 0]
    },{
			label: 'Google',
			backgroundColor: gradientd,
			pointBackgroundColor: '#F2CA50',
			borderWidth: 1,
			borderColor: '#F2CA50',
			data: [669, 770, 555, 254, 181, 240, 0, 0, 0, 0, 0, 0]
    }
							
		]
};

var options = {
	responsive: true,
	maintainAspectRatio: true,
	animation: {
		easing: 'easeInOutQuad',
		duration: 520
	},
	scales: {
		xAxes: [{
			gridLines: {
				color: 'rgba(200, 200, 200, 0.05)',
				lineWidth: 1
			}
		}],
		yAxes: [{
			gridLines: {
				color: 'rgba(200, 200, 200, 0.08)',
				lineWidth: 1
			}
		}]
	},
	elements: {
		line: {
			tension: 0.4
		}
	},
	legend: {
		display: false
	},
	point: {
		backgroundColor: 'white'
	},
	tooltips: {
		titleFontFamily: 'Open Sans',
		backgroundColor: 'rgba(0,0,0,0.3)',
		titleFontColor: 'white',
		caretSize: 5,
		cornerRadius: 2,
		xPadding: 10,
		yPadding: 10
	}
};

var chartInstance = new Chart(chart, {
    type: 'line',
    data: data,
		options: options
});