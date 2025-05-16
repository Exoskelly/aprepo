import pandas as pd
import numpy as numpy
import seaborn as sb
import matplotlib.pyplot as plot
import data_cleaner as dc

df = dc.data_cleaner("langdocscpp/bigdata/data/country_wise_latest.csv")
pd.options.display.float_format = "{:.10f}".format
sorted_df_confirmed = df.sort_values("Confirmed")
plot.figure(figsize = (12, 10))
df_whovals = df.groupby("WHO Region")["Deaths / 100 Cases"].mean()
ax = sb.barplot(x = df_whovals.index, y = df_whovals.values, color = "slateblue")
ax.bar_label(ax.containers[0], fontsize = 10)
plot.title("Correlation of WHO Region and Deaths / 100 Cases")
plot.ylabel("Deaths / 100 Cases")
plot.xticks(rotation = 90)
plot.savefig("langdocscpp/bigdata/plots/plot1.png")
ax = sb.barplot(x = sorted_df_confirmed["Confirmed"], y = sorted_df_confirmed["Deaths / 100 Cases"], color = "slateblue")
ax.bar_label(ax.containers[0], fontsize = 10) 
plot.xlabel("Confirmed Cases")
plot.ylabel("Deaths")
plot.savefig("langdocscpp/bigdata/plots/plot2.png")